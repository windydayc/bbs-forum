package cn.ncu.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Post implements Serializable {
    private Integer pid;     //帖子id
    private Integer uid;      //发帖人id
    private Timestamp askTime;  //发帖时间
    private String title;    //帖子标题
    private String content;   //发帖内容
    private Integer currentFloor;  //帖子楼层数
    private Integer likenum;   //点赞数
    private Integer isGood;    //是否精品
    private Integer isTop;    //是否置顶
    private Integer kind;       // 帖子的种类
    private Timestamp LastActiveTime;   // 帖子的最后活跃时间

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Timestamp getaskTime() {
        return askTime;
    }

    public void setaskTime(Timestamp askTime) {
        this.askTime = askTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Integer currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public Integer getIsGood() {
        return isGood;
    }

    public void setIsGood(Integer isGood) {
        this.isGood = isGood;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public Timestamp getLastActiveTime() {
        return LastActiveTime;
    }

    public void setLastActiveTime(Timestamp lastActiveTime) {
        LastActiveTime = lastActiveTime;
    }

    @Override
    public String toString() {
        return "Post{" +
                "pid=" + pid +
                ", uid=" + uid +
                ", askTime=" + askTime +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", currentFloor=" + currentFloor +
                ", likenum=" + likenum +
                ", isGood=" + isGood +
                ", isTop=" + isTop +
                ", kind=" + kind +
                ", LastActiveTime=" + LastActiveTime +
                '}';
    }
}