package mirea.l3;

import javax.swing.*;

public interface IDocument {
    public JComponent neww();
    public JComponent open();
    public void save();
    public void exit();
}