# design-pattern
design-pattern을 공부하기위한 레포지터리

## 객체 생성 관련
### 싱글톤 패턴
![singleton](./img/singleton.png)
- 어떤 클래스의 인스턴스를 오직 한개만 제공한다.
- 스프링에서 빈의 기본 스코프로 사용된다.
- 빌더, 파사드, 추상 팩토리 등 다른 디자인 패턴 구현체의 일부로 사용되기도 한다. 
- [`싱클톤 패턴 예제`](src/main/java/example/_1_creational/_1_singleton)

### 팩토리 메소드 패턴
![abstract_factory](./img/factory_method.png)
- 어떤 인스턴스를 생성하는 책임을 인터페이스로 추상화한다.
- 다양한 구현체가 있고, 그중에서 특정한 구현체를 만들 수 있는 다양한 팩토리를 제공할 수 있다.
- 확장에 열려있고 변경에 닫혀있는 개발을 할 수 있다.
- [`팩토리 메소드 패턴 예제`](src/main/java/example/_1_creational/_2_factory_method)

## 구조 관련

## 행동 관련

