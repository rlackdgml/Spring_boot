package com.biz.book.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="tbl_book")
public class BookVO {

    @Id  // primary key 이다 라는 것을 알려주는 어너테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "str_name")
    private String strName;

    @Column(columnDefinition = "VARCHAR(125)")
    private String title;

    @Column(length = 30)
    private String author;
    @Column(length = 125)
    private String comp;

    @Column(nullable = true)
    private int price;

}
