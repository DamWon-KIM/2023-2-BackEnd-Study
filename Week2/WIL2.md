### HTTP란?
 HyperText Transfer Protocol
 클라이언트와 서버가 자원을 주고 받을 때 쓰는 통신 규약으로, 요청/응답 모델에 기반한다
 서로 다른 시스템들 사이에서 통신을 주고 받게 해주는 application 계층 protocol

Hypertext[다른 페이지의 링크를 담고 있는 문서]
Transfer [이동 통신]
Protocol [규약]

 ### HTTP의 특징
 * Transfer layer
   * TCP/IP 기반으로 서버와 클라이언트 간의 요청과 응답을 전송한다.
 * 비 연결성[connectionless]
   * 클라이언트와 서버가 한번 연결을 맺은 후에 클라이언트의 요청에 대해 서버가 응답을 마치면 연결을 끊어버린다.
   * 이를 통해 최소한의 자원으로 서버유지를 가능하게 한다.  
 * 무상태성[stateless]
   * Connectionless로 인해 서버가 두 요청간의 어떠한 데이터도 유지하지 않는다.
   * 서버는 클라이언트와 연결에 대한 정보를 저장하지 않는다.
   * 서버는 클라이언트를 식별하지 못한다.

 #### HTTP 비 연결성 극복 - HTTP 지속 연결
  * HTTP 초기 : 연결, 종료 낭비
    * HTTP 초기에는 각각의 자원을 다운로드하기 위해 연결과 종료를 반복해야 했다. 
  * HTTP 지속 연결(Persistent Connections)
    * HTTP 지속 연결에서는 연결이 이루어지고 난 뒤 각각의 자원들을 요청하고 모든 자원에 대한 응답이 돌아온 후에
      연결을 종료한다.
 
### HTTPS vs HTTP
HyperText Transfer Protocol Secure
HTTPS는 SSL이라는 프로토콜을 사용한다.</br>
이때, SSL이란 것은 Secure Sockets Layer이라 한다.</br>
HTTP는 보안이 취약해서 도청과 위장, 변조가 가능한데 HTTPS는 CA를 통해 공개키 암호화 방식으로 텍스트를 암호화 하다보니</br>
무조건 안전하지는 않지만 보안성을 띄게 된다. HTTPS는 HTTP와 다르게 443번 포트를 사용하며, 네트워크 상에서 중간에 제3자가 정보를 볼 수 없도록 암호화를 지원하고 있다.

이 때, 

1. 서버는 CA에게 서버의 공개키를 제공하고
2. 서버의 공개키를 CA의 개인키로 서명한 공개키 인증서를 전달한다.
3. 서버는 클라이언트에게 공개키 인증서를 전달한다.
4. 클라이언트는 브라우저에 내장된 CA 공개키로 공개키 인증서를 복호화한다.
5. 클라이언트는 서버의 공개키를 획득한다.
6. 이렇게 서버의 공개키를 안전하게 전달받은 클라이언트는 공개키 암호화 방식을 통해 서버와 대칭키를 주고 받을 수 있게 되고, 그 대칭키를 통해 암호화된 메시지를 주고받을 수 있게 된다.


#### HTTP Method
 REST를 지키면서 행위를 전달하는 방
 클라이언트가 서버에 특정 요청을 보낼 때, 웹서버에게 요청하는 목적 및 그 종류를 알리는 수단으로 HTTP Method를 사용한다.

 * GET : 리소스 조회
 * POST : 요청 데이터 처리, 주로 등록에 사용
 * PUT : 리소스를 대체, 해당 리소스가 없으면 생성
 * PATCH : 리소스 부분 변경
 * DELETE : 리소스 삭제
______________________________________________________________________________
 * HEAD : GET과 동일하지만 메세지 부분을 제외하고, 상태 줄과 헤더만 변환 
 * OPTIONS : 대상 리소스에 대한 통신 가능 옵션(메서드)을 설명(주로 CORS에서 사용)
 * CONNECT : 대상 리소스로 식별되는 서버에 대한 터널을 설정
 * TRACE : 대상 리소스에 대한 경로를 따라 메세지 루프백 테스트를 수행

   

### API에 대한 RESTful URI를 설계
```
이벤트 목록 조회
GET /events
```
```
이벤트 조회
GET /events/ [id_number]
```
```
이벤트 등록
POST /events/ [id_number]
```
```
이벤트 수정
PUT /events/ [id_number]
```
```
이벤트 삭제
DELETE /events/ [id_number]
```
```
이벤트 상태 변경
PATCH /events/ [id_number]
```
```
특정 이벤트의 주문 목록 조회
GET /events/ [id_number] /orders
```
```
멤버 목록 조회
GET /members
```
```
특정 멤버 권한 변경
PATCH /members/ [id_number] / authority
```
```
특정 멤버 정보 조회
GET /members/ [id_number] / inform
```
```
특정 멤버 정보 변경
PUT /members/ [id_number] / inform
```
```
멤버 등록
POST /members/ [id_number]
```

[참고링크](https://velog.io/@couchcoding/%EA%B0%9C%EB%B0%9C-%EC%B4%88%EB%B3%B4%EB%A5%BC-%EC%9C%84%ED%95%9C-RESTful-API-%EC%84%A4%EA%B3%84-%EA%B0%80%EC%9D%B4%EB%93%9C#%EC%84%A4%EA%B3%84-%EC%98%88)
