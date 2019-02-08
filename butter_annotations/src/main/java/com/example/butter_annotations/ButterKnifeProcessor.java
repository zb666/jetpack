package com.example.butter_annotations;

import com.example.annotation.BindClass;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

public class ButterKnifeProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        Set<? extends Element> elementSet = roundEnvironment.getElementsAnnotatedWith(BindClass.class);
        //获取元素的全部的节点
        for (Element element : elementSet) {
            generateBinderClass((TypeElement) element);
        }
        return true;
    }

    /**
     * 动态生成class文件
     * @param element
     */
    private void generateBinderClass(TypeElement element) {
//        return Collections.singleton(BindClass.class.getCanonicalName());
    }
}
