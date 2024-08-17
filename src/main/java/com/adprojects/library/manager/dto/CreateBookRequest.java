package com.adprojects.library.manager.dto;

import com.adprojects.library.manager.model.Author;
import com.adprojects.library.manager.model.Book;
import com.adprojects.library.manager.model.enums.Genre;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateBookRequest {

    @NotBlank
    private String name; // book name

    @NotNull
    private Genre genre;

    private Integer pages;

    @NotBlank
    private String authorName;

    private String authorCountry;

    @NotBlank // not null + empty string
    private String authorEmail;

    public Book to() {
        return Book.builder()
                .name(this.name)
                .pages(this.pages)
                .genre(this.genre)
                .my_author(
                        Author.builder()
                                .name(this.authorName)
                                .country(this.authorCountry)
                                .email(this.authorEmail)
                                .build()
                )
                .build();
    }
}
