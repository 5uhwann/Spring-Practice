package hello.hellospring.domain;

public class Member {

    private Long id;  //고객이 정한 ID가 아닌 데이터 구분을 위한 시스템을 위한 id
    private String name; // 고객이 회원가입 시 적는 이름

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
