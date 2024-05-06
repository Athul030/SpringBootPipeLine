package com.example.demo.ErrorHandlers;


public class ItemNotFoundException extends  RuntimeException{

    private Long id;

    public ItemNotFoundException(Long id){
        super("Could not find item with id " + id);
    }


}
