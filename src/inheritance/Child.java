package inheritance;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Child extends Parent {                     // 모든 자바 클래스는 Object에 상속된다 (최상 클래스)

    private String hobby;

    @Override                                               // @(annotation): Meta프로그래밍, 오타 등이 생길 경우 @이하에 에러 표시
    public void smoke() {
        System.out.println("아들이 담배를 핍니다.");
    }
//    public final void smoke() {                           // final을 붙이면 Overriding할 수 없다. Compile time Binding(처리 속도가 빠르다.)
//            System.out.println("아들이 담배를 핍니다.");
//    }


    public String getHobby() {return hobby;}
    public void setHobby(String hobby) {this.hobby = hobby;}
}
