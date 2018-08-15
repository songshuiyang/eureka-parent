## Spring Cloud

### Spring Cloud Netflix简介
SpringCloud是一个基于SpringBoot实现的云应用开发工具，它为基于JVM的云应用开发中的配置故那里、服务发现、断路器、智能路由、微代理、控制总线、全局锁、决策竞选、分布式会话和集群状态管理等操作提供了简单的开发方式。

SpringCloud下包含了多个工程，其中的Spring Cloud Netflix提供了一系列搭建微服务基础架构的功能组件。

Netflix的部分组件及功能特性如下：
1. Eureka（服务注册与发现框架）：一个基于REST风格的服务组件，用于定位服务，以实现云端的负载均衡和中间层服务器的故障转移
2. Hystrix（服务容错组件）：容错管理工具，旨在通过控制服务和第三方库的节点，从而对延迟和故障提供强大的容村能力
3. Zuul（服务网关）：边缘服务工具，提供动态路由、监控、贪心、安全等边缘服务
4. Ribbon（客户端负载均衡器）：提供客户端负载均衡算法，将Netflix的中间层服务连接起来
5. Feign（声明式HTTP客户端）：可以创建声明式、模板化的HTTP客户端，进行微服务调用

### 什么是 Eureka
Eureka是Netflix开发的服务发现框架，本身是一个基于REST的服务，主要用于定位运行在AWS域中的中间层服务，以达到负载均衡和中间层服务故障转移的目的。SpringCloud将它集成在其子项目spring-cloud-netflix中，以实现SpringCloud的服务发现功能。

![image]( https://github.com/songshuiyang/eureka-parent/blob/master/doc/images/eureka1.png)

### 服务发现
服务发现就像聊天室一个,每个用户来的时候去服务器上注册,这样他的好友们就能看到你,你同时也将获取好友的
上线列表.在微服务中,服务就相当于聊天室的用户,而服务注册中心就像聊天室服务器一样,目前服务发现的解决
方案有Eureka,Consul,Etcd,Zookeeper,SmartStack,等等.
Eureka Client通过HTTP(或者TCP,UDP)去Eureka Server册和获取服务列表,为了高可用一般会有多个
Eureka Server组成集群.Eureka会移除那些心跳检查未到达的服务.
