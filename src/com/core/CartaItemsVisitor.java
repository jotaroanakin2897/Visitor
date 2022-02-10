package com.core;

public interface CartaItemsVisitor {
    public void visit(Book book);
    public  void visit(BluRay bluray);
}
