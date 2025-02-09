package ma.xproce.atelierjee.service;

import ma.xproce.atelierjee.doa.entities.Video;
import ma.xproce.atelierjee.doa.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoManager implements VideoService{
    @Autowired
    private VideoRepository videoRepository;


    @Override
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    @Override
    public Video addVideo(Video video) {
        return videoRepository.save(video);
    }

    @Override
    public Video updateVideo(Video video) {
        if(videoRepository.findById(video.getId()) != null) {
            return videoRepository.save(video);
        }
        return null;
    }

    @Override
    public boolean deleteVideo(int id) {
        try {
            videoRepository.findById(id).get();
            videoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public Video getVideo(int id) {
        try {
            return videoRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

}
