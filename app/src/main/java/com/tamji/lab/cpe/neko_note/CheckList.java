package com.tamji.lab.cpe.neko_note;

import java.util.List;

public class CheckList extends Note{

    private List<String> items;
    private List<Boolean> checkState;

    public CheckList(String title, String createDate, String author) {
        super(title, createDate);
    }

/*    public CheckList(String title) {
        super(title);
        this.items = new ArrayList<>();
        this.checkState = new ArrayList<>();
    }*/

    public void addItems(String name, Boolean check) {
        this.items.add(name);
        this.checkState.add(check);
    }

    public String getSummary() {
        StringBuilder summary = new StringBuilder();

        for (int i = 0; i < items.size(); i++) {
            if (items.size() == checkState.size()){
                summary.append("- [").append(checkState.get(i)).append("] ").append(items.get(i)).append("\n");
            } else {
                continue;
            }
        }
        return summary.toString();
    }
}
