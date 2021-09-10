import java.lang.*;

public class Book
{
    private String name;
    private int pages;
    private int read;
    public Book(String n,int a,int x)
    {
        name = n;
        pages = a;
        read = x;
    }
    public Book(String n)
    {
        name = n;
        pages = 0;
        read = 0;
    }
    public Book()
    {
        name = "Book";
        pages = 10;
        read = 0;
    }
    public void setPages(int pag)
    {
        this.pages = pag;
    }
    public void setRead(int re)
    {
        this.pages = re;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName(String name)
    {
        return name;
    }
    public int getPages()
    {
        return pages;
    }
    public int getRead()
    {
        return read;
    }
    public String toString()
    {
        return this.name + ", Pages "+this.pages + ", Pages read "+this.read;
    }
    public void alreadyRead ()
    {
        System.out.println("In a Book '"+name+"' with "+pages+" pages, there were "+(pages-read)+" pages left to read.");
    }
}
