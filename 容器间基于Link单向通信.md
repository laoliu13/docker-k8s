1. 解决容器之间单向的通信问题；例如容器服务很多的情况下，不可能只用ip访问，比如应用访问数据库容器
2. 举例
 - 命令
   ```
   docker run --name myweb --link mydb -d centos sleep 1d
   ```
 - 解释
   - 示例中运行一个名为myweb的centos容器，休眠一天
   - --link 就是链接到哪一个需要访问的容器mydb
   - `docker exec` 登陆到容器验证
