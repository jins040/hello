package gourmet;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class Gourmet {

    // 필드
    private String title;
    private String mainMenu;
    private int score;

    // 생성자, 모양이 있지만 생략되어 있는 것
    public Gourmet() {
        System.out.println("생성자 정말 생성되나요?");    // 개발자 로그
    }

    public Gourmet(String title, String mainMenu, int score) {  // 3개 Input 생성자, 우클릭+Generate+Constructor
        this.title = title;
        this.mainMenu = mainMenu;
        this.score = score;
    }

    //


    // Method   // 우클릭+Refactor+Encapsulate~
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getMainMenu() {return mainMenu;}
    public void setMainMenu(String mainMenu) {this.mainMenu = mainMenu;}

    public int getScore() {return score;}
    public void setScore(int score) {this.score = score;}

    // getter setter 자동생성


//    // private 선언일 때 get set 접근권한 설정, getter setter 생성
//    public String getTitle() {                                  // getter 이름 설정 get'Name', getter(accessor)
//        return this.title;
//    }
//    public void setTitle(String title) {                            // setter 이름 설정, setter(mutator)
//        this.title = title;
//    }
//
//    public String getMainMenu() {
//        return this.mainMenu;
//    }
//    public void setMainMenu(String mainMenu) {
//        this.mainMenu = mainMenu;
//    }
//
//    public int getScore() {
//        return score;
//    }
//    public void setScore(int i) {
//        score = i;
//    }

}
