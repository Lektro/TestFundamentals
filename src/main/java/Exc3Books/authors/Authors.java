package Exc3Books.authors;

import Exc3Books.books.Books;

public class Authors extends Books {
    private String authorName;
    private String email;
    private char gender;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    /** to String method to print all the info inside this class */
    @Override
    public String toString() {
        return "Authors{" +
                "authorName='" + authorName + '\'' +
                ", eMail='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
