package example._1_creational._5_prototype;

public class App {

  public static void main(String[] args) throws CloneNotSupportedException {
    GithubRepository repository = new GithubRepository();
    repository.setUser("minjun");
    repository.setName("design-pattern-study");

    GithubIssue githubIssue = new GithubIssue(repository);
    githubIssue.setId(1);
    githubIssue.setTitle("생성 관련 패턴들");

    String url = githubIssue.getUrl();
    System.out.println(url);

    GithubIssue clone = (GithubIssue) githubIssue.clone();
    System.out.println(clone.getUrl());

    repository.setUser("minjun.jo");

    System.out.println(clone != githubIssue);
    System.out.println(clone.getClass() == githubIssue.getClass());

    System.out.println(clone.equals(githubIssue));
    System.out.println(clone.getRepository() == githubIssue.getRepository());

    System.out.println(clone.getUrl());
  }
}
