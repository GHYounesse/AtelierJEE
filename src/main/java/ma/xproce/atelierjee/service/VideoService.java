package ma.xproce.atelierjee.service;

import ma.xproce.atelierjee.doa.entities.Video;

import java.util.List;

public interface VideoService {
    public Video getVideo(int id);
    public List<Video> getAllVideos();
    public Video addVideo(Video video);
    public Video updateVideo(Video video);
    public boolean deleteVideo(int id);
}
