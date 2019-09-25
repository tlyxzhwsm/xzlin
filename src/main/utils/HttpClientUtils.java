package utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpClientUtils {

    //get方式请求
    public String doGet(String url, String encode) {
        String result = "";
        //创建请求客户端
        CloseableHttpClient client = HttpClients.createDefault();
        //发送请求
        HttpGet request = new HttpGet(url);
        request.setHeader("Connection", "close");
        //获取响应结果
        CloseableHttpResponse response = null;
        try {
            response = client.execute(request);
        } catch (IOException e) {
            System.out.println("请求资源失败");
            e.printStackTrace();
        }
        //获得响应头
        int respCode = response.getStatusLine().getStatusCode();
        if (respCode == 200) {
            HttpEntity entity = response.getEntity();
            try {
                result = EntityUtils.toString(entity, encode);
            } catch (IOException e) {
                System.out.println("HttpClientUtils获取内容失败");
                e.printStackTrace();
            } finally {
                if (null != entity) {
                    //释放内容？？
                    try {
                        EntityUtils.consume(entity);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //关闭请求
                    if (null != request) {
                        request.abort();
                        //关闭客户端
                        if (null != client) {
                            try {
                                client.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }

        }else{
            System.out.println("get请求失败，状态码非200");
        }
        return result;
    }


    //post请求方式
    public String doPost(String url, String encode, Map<String,String> params){
        String result="";
        CloseableHttpClient client= HttpClients.createDefault();
        // RequestConfig config = RequestConfig.custom().setConnectTimeout(5000) //
        // 设置连接超时时间
        // .setConnectionRequestTimeout(3000) // 设置请求超时时间
        // .setSocketTimeout(5000) // 读取超时时间
        // .build();
        HttpPost post =new HttpPost(url);
        // post.setConfig(config);
        // 准备参数
        List<BasicNameValuePair> list =new ArrayList<>();
        for (java.util.Map.Entry<String,String> entry:params.entrySet()){
            list.add(new BasicNameValuePair(entry.getKey(),entry.getValue()));
        }
        //放入参数
        UrlEncodedFormEntity postParams = null;
        try {
            postParams = new UrlEncodedFormEntity(list);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        post.setEntity(postParams);
        post.setHeader("Connection", "close");
        HttpEntity entity =null;
        //发送post请求
        CloseableHttpResponse response = null;
        try {
            response=client.execute(post);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取响应结果
        int statusCode=response.getStatusLine().getStatusCode();
        if (statusCode==200){
            entity =response.getEntity();
            try {
                result=EntityUtils.toString(entity,encode);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("获取结果失败");
            }finally {
                if (entity != null)
                    try {
                        EntityUtils.consume(entity);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                if (post != null)
                    post.abort();

                if (client!= null)
                    try {
                        client.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        }else{

            System.out.println("post请求失败，状态码非200");
        }

        return result;
    }


}
