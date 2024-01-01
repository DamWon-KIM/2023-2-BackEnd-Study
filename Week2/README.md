### RestAPI
```
API
Application Programming Interface
내 서버랑 통신할 수 있는 방법
프로그램 간에 통신할 수 있는 통신 규약
```
RESTfulAPI와 RESTAPI의 차이점

REST (Representational State Transfer): </br>
* REST는 웹 서비스의 아키텍처 스타일이다. 이 스타일은 웹의 장점을 최대한 활용할 수 있는 아키텍처를 기술한다. </br>
* 상태를 가진 자원을 중심으로 하며, 이러한 자원은 URI(Uniform Resource Identifier)로 식별된다. </br>
* 명확하게 6가지 특성을 가지며 이는 클라이언트-서버 구조, 무상태성, 캐시 가능, 계층화 시스템, 코드 온 디맨드(opional), 및 유니폼 인터페이스 등이 포함된다. </br>
  ```
  1. Uniform Interface
    api제작을 할 때 url 형식이 간결하고 형식이 일관적, 예측가능해야 한다
    * 하나의 자료는 하나의 URL로
    * URL 하나를 알면 둘을 알 수 있어야 함
    * 요청과 응답은 정보가 충분히 들어있어야 한다
  2. Client - Server 역할이 구분 가능해야한다
    브라우저는 요청만 할 뿐
    서버는 응답만 할 뿐
  3. Stateless
    고객의 요청1과 요청2는 의존성이 없어야 한다
    연관이 되어있으면 안된다
    요청마다 단독으로 관리를 해야 한다
  4. Cacheable
    * 서버에서 보내주는 정보들은 캐싱이 가능해야 한다
    * 캐싱을 위한 버전 같은 것도 관리를 잘해야 하는데, 실은 브라우저가 잘해준다
  5. Layered System
  6. Code on Demand
  --- 이 6가지를 잘 지키면 Restful하다고 한다
  ```
* 특정 프로토콜에 종속되지 않지만, 일반적으로 HTTP/HTTPS 위에서 구현된다. </br></br></br>


RESTful API: </br>
* RESTful API는 REST 원칙과 특성을 준수하여 구현된 웹 서비스 API를 의미한다. </br>
* 즉, RESTful API는 REST 아키텍처 스타일을 따르는 API이다. </br>
* HTTP 메서드를 사용하여 CRUD(Create, Read, Update, Delete) 작업을 수행하고, 표준 HTTP 상태 코드를 사용하여 응답한다. </br>
* 요약하자면, REST는 웹 서비스의 아키텍처 스타일을 의미하며, RESTful API는 이 REST 원칙을 따르며 구현된 웹 서비스 API를 의미한다. </br>
* 일상적인 대화나 문서에서는 이 두 용어가 서로 바꿔 사용되기도 하지만, 그 기본적인 의미와 차이점을 알고 있으면 더 명확한 통신이 가능하다.
