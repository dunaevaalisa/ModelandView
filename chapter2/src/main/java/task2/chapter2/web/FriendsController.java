package task2.chapter2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import task2.chapter2.domain.Friend;

@Controller
public class FriendsController {
    private List<Friend> friendList = new ArrayList<>();

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("friends", friendList);
        return "index";
    }

    @PostMapping("/addFriend")
    public String addFriend(@RequestParam String firstName, @RequestParam String lastName) {
        Friend newFriend = new Friend(firstName, lastName);
        friendList.add(newFriend);
        return "redirect:/index";
    }

}
