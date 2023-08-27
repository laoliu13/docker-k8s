1. 解决容器之间的双向通信问题
2. 举例
  - 命令
    - 显示当前有哪些网桥 `docker network ls`
    - 创建一个自定义名称为`my-brige`的网桥 `docker network create -d brige my-brige`
    - 创建两个容器`docker run --name w1 -d centos sleep 1d`、`docker run --name w2 -d centos sleep 1d`
    - 将创建的容器链接到网桥`docker network conect my-brige w1`、`docker network conect my-brige w2`
    - `docker exec` 登陆到容器验证
