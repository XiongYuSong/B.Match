package hue.edu.xiong.java5minute.course3.model;

/**
 * @Author: Xiong
 * @Date: 2018/5/31 20:42
 */
public class SongInfo {

    //歌曲名称
    private String name;
    //歌手名称
    private String singer;
    //专辑名称
    private String albumName;
    //评论数
    private int commentCount;
    //歌词
    private String lyrics;
    // 专辑图片
    private String albumImg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getAlbumImg() {
        return albumImg;
    }

    public void setAlbumImg(String albumImg) {
        this.albumImg = albumImg;
    }
}
