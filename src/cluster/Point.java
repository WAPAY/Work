package cluster;

/**
 * Created by kenedy.wy on 17/5/1.
 */
public class Point {

    private int index;
    private boolean isVisit;
    private int cluster;
    private boolean isNoised;

    public Point(int index) {
        this.isVisit = false;
        this.cluster = 0;
        this.isNoised = false;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setVisit(boolean isVisit) {
        this.isVisit = isVisit;
    }

    public boolean getVisit() {
        return isVisit;
    }

    public int getCluster() {
        return cluster;
    }

    public void setNoised(boolean isNoised) {
        this.isNoised = isNoised;
    }

    public void setCluster(int cluster) {
        this.cluster = cluster;
    }

    public boolean getNoised() {
        return this.isNoised;
    }

    @Override
    public String toString() {
        return index+" "+cluster+" "+(isNoised?1:0);
    }

}
