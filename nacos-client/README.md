
#### nacos 本地使用  

1. 启动nacos server  
- 解压tar.gz包，本地使用 standalone 模式启动。
```shell script
sh startup.sh -m standalone
```
- jps查看是否有nacos，浏览器查看是否正常运行 [nacos](http://127.0.0.1:8848/nacos)
- 启动nacos client（运行NacosClientApplication）
- 请求[client](http://127.0.0.1:10011/config/get)
- [nacos](http://127.0.0.1:8848/nacos)修改userLocalCache配置或者请求[client](http://localhost:10011/config?dataId=nacos.spring.config&content=useLocalCache=444)修改                
- 请求[client](http://127.0.0.1:10011/config/get)修改后的值
    