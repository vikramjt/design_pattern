package com.vikram.designpatt.observer.example4.baeldung;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

//Observable object
public class PCLNewsAgency {
    private String news;
 
    private PropertyChangeSupport support;
 
    public PCLNewsAgency() {
        support = new PropertyChangeSupport(this);
    }
 
    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }
 
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
 
    public void setNews(String value) {
        support.firePropertyChange("news", this.news, value);
        this.news = value;
    }
}
