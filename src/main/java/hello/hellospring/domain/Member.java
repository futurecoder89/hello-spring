package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)  //디비가 알아서 id를 생성해주는것을 identity라고 함
    private Long id;

    /*@Column(name = "username")*/
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
