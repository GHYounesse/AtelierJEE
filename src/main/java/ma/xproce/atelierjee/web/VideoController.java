package ma.xproce.atelierjee.web;

import ma.xproce.atelierjee.doa.entities.Video;
import ma.xproce.atelierjee.service.VideoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class VideoController {
    @Autowired
    private VideoManager videoManager;
    @GetMapping()
    public String getVideos(Model model) {
        List<Video> videos = videoManager.getAllVideos();
        model.addAttribute("videos", videos);
        return "videos";
    }
    @GetMapping("/add")
    public String addVideoForm() {
        return "add_video_form";
    }
    @PostMapping("/ajouter")
    public String addVideo(Model model,@RequestParam(name = "name", defaultValue = "") String name, @RequestParam(name = "description") String description, @RequestParam(name = "url") String url) {
       Video video = new Video(name, description, url);
       videoManager.addVideo(video);
       return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteVideo(@PathVariable("id") Integer id) {
        if(videoManager.deleteVideo(id)) {
            return "redirect:/";
        }else {
            return "error";
        }
    }
    @GetMapping("/update/{id}")
    public String updateVideoForm(@PathVariable("id") Integer id, Model model) {
        System.out.println(id);
        if(videoManager.getVideo(id) != null) {
            model.addAttribute("vid", videoManager.getVideo(id));
            return "update_video_form";
        }else {
            return "error";
        }

    }
    @PostMapping("/modifier/{id}")
    public String modifierVideo(@PathVariable("id") Integer id,@RequestParam(name = "name", defaultValue = "") String name, @RequestParam(name = "description") String description, @RequestParam(name = "url") String url) {

        Video video = new Video(id,name, description, url);
        videoManager.updateVideo(video);
        if (video != null) {




            return "redirect:/";
        } else {

            return "error";
        }
    }




}
