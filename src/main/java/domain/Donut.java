package domain;

public class Donut {
    private boolean donut;
    private int paidDuration;
    private boolean canPublishFreeCopy;
    private String editMode;

    public boolean isDonut() {
        return donut;
    }

    public void setDonut(boolean donut) {
        this.donut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }

}
