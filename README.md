# cloud-test-demo

该项目基于springboot编码，应用于基于kubernetes平台的一些测试工作。

该项目目前共有三个分支：

- master：服务使用jar包为载体，并连接后端数据库MySQL

- feature-no-mysql-deps：服务使用jar包为载体，去除与后端数据相关的逻辑

- feature-war-package：服务使用war包为载体，并连接后端数据库MySQL

## 构建

### 编译命令

``mvn clean && mvn -Dmaven.test.skip=true``

### 镜像构建

Dockerfile文件位于项目根目录下，构建命令为：

``docker build -f {projectDir}/Dockerfile -t {镜像名}:{标签} {projectDir}/``

## 配置

在构建镜像完成后，使用JAVA_OPTS环境变量传递运行参数。

例如使用`-Dspring.config.location={applicationYamlFileUrl}`指定jar包加载外部application.yml配置文件。

## 接口

### 图书相关接口

注：feature-no-mysql-deps无相关接口

#### 添加图书

GET /book/add?bookName={bookName}&price={price}&store={store}

- bookName string 图书名
- price double 价格
- store int 库存

返回浏览器可显示的字符串

#### 根据名称模糊查询图书

GET /query/{name}

- name string 图书名

返回浏览器可显示的字符串

#### 查询所有图书

GET /query 

返回浏览器可显示的字符串

#### 按照价格升序查询前几本图书

GET /query/{number}

- number int 查询的数量

返回浏览器可显示的字符串

### 计算相关接口

#### 取两个随机数加法计算

GET /counter/add

返回浏览器可显示的字符串

### 健康检查相关接

#### 健康检查

GET /health

返回OK

#### 设置健康状态

GET /health/{status}

- status bool 状态

设置程序健康状态

### 版本接口

#### 查询配置文件中配置版本

GET /version

返回程序版本

