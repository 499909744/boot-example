# 项目功能描述
UserController提供了2个请求

一个是/uers/，允许请求

一个是/users/10001，必须认证之后才能访问

当我们访问localhost:8080/users的时候，可以直接返回数据

当我们访问localhost:8080/users/10001的时候，返回认证失败，方便前端可以跳转到登录界面

实现了完美的权限校验功能
