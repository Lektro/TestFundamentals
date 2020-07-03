package Exc3Books.authors;

import Exc3Books.books.Books;

public class Authors extends Books {
    private String authorName;
    private String eMail;
    private char gender;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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
                ", eMail='" + eMail + '\'' +
                ", gender=" + gender +
                '}';
    }
}
