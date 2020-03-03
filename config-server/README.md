
#### config-server测试  

1. 启动config-server
   - 查看是否是正常启动 http://localhost:8000/application/dev/master  
2. 查看server中请求过来的配置信息，根据client配置信息，请求 
[config-server](http://localhost:8000/config-client/dev/master),
查看是不是和github是的信息是一致的。
    > 请求规则 application-应用名 label-分支 profile-环境
    >> /{application}/{profile}/{label}  
    >> /{application}-{profile}.yml  
    >> /{label}/{application}-{profile}.yml  
    >> /{application}-{profile}.properties  
    >> /{label}/{application}-{profile}.properties    
3. 启动config-client，查看controller请求返回是什么[config-client](http://localhost:8080/info)
4. 修改github上的配置文件
5. 查看[config-server](http://localhost:8000/config-client/dev/master)是否加载到最新配置
6. 启动postman刷新config-client，请求地址是 http://localhost:8080/actuator/refresh ，
也可以通过[config-client-actuator](http//localhost:8080/actuator)查看暴露的接口
7. 再次请求[config-client](http://localhost:8080/info)，查看最新配置
