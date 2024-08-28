package jpabook.start;
import javax.persistence.*;  //**

public class Test {

    @Id
    @Column(name = "ID")
    private String id;
    
    @Column(nullable = false)
    private String data;
}
