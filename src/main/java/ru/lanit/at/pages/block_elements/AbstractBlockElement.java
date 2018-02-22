package ru.lanit.at.pages.block_elements;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.lanit.at.context.Context;
import ru.lanit.at.make.Make;
import ru.lanit.at.make.Wait;
import ru.lanit.at.pages.AbstractPage;
import ru.lanit.at.pages.PageCatalog;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class AbstractBlockElement extends HtmlElement {

    protected Logger log = LogManager.getLogger(getClass());
    protected Wait wait;
    protected Make make;

    private PageCatalog pageCatalog;

    public AbstractBlockElement() {
        wait = Context.getInstance().getBean(Wait.class);
        make = Context.getInstance().getBean(Make.class);
        pageCatalog = Context.getInstance().getBean(PageCatalog.class);
    }

    protected <T extends AbstractPage> T getPage(Class<T> clazz){
        return pageCatalog.getPage(clazz);
    }
}
