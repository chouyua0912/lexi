package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import visitor.IVisitor;

/**
 * 图元顶层定义
 */
public abstract class Glyph {

    public abstract void draw(Graphics graphics, int x, int y);

    public abstract void select(Graphics graphics, Color highLightColor,
                                Color fontColor, int x, int y);

    public abstract int getWidth();

    public abstract int getHeight();

    public abstract Font getFont();

    public abstract void setFont(Font font);

    public abstract void accept(IVisitor visitor);      // 接收visitor，做分析

    public abstract Element toXmlElement(Document document);
}
