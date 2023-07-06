package template;

public abstract class DisplayArticleTemplate {
    protected Article article;
    protected abstract void title();
    protected abstract void content();
    protected abstract void footer();

    public DisplayArticleTemplate(Article article) {
        this.article = article;
    }

    // 이 메소드는 변경 불가능
    public final void display() {
        title();
        content();
        footer();
    }
}
