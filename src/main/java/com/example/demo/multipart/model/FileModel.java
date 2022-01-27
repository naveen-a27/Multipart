package com.example.demo.multipart.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "Files")
public class FileModel {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    private String id;
    private String name;
    private String type;
    @Lob
    private byte[] data;

    public FileModel() {
    }

    public FileModel(String id, String name, String type, byte[] data) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FileModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}
