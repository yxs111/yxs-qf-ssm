package com.qf.controller;

import com.qf.domain.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2019/5/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
  private UserService userService;
       @RequestMapping("/selectAll")
    public ModelAndView selectAll(){
        List<User> users=userService.selectAll();
        System.out.println(users);
        ModelAndView md= new ModelAndView();
        md.setViewName("show");
        md.addObject("users",users);
        return md;

    }
    /*
   @RequestMapping("/delete")
   public ModelAndView delete() {
       User users = new User();
       users.setId(7);
       userService.deleteById(users);
       System.out.println(users);
       ModelAndView md = new ModelAndView();
       md.setViewName("user");
       md.addObject("users", users);
       return md;

   }
   @RequestMapping("/update")
   public ModelAndView update(){
       User users = new User();
       users.setName("周瑜");
       users.setId(1);
       userService.updateById(users);
       System.out.println(users);
       ModelAndView md= new ModelAndView();
       md.setViewName("user");
       md.addObject("users",users);
       return md;

   }
   @RequestMapping("/insert")
   public ModelAndView insertUser(){
       User users = new User();
       users.setName("周瑜");
       users.setSex("男");
       users.setBirthday(new Date());
       users.setAddress("威海");
       userService.insertUser(users);
       System.out.println(users);
       ModelAndView md= new ModelAndView();
       md.setViewName("user");
       md.addObject("users",users);
       return md;

   }
   */
   @RequestMapping("/selectById/{id}")
   public ModelAndView select(@PathVariable("id") int id){

       User user = userService.selectById(id);
       System.out.println(user);
       ModelAndView md= new ModelAndView();
       md.setViewName("updateById");
       md.addObject("users",user);
       return md;


   }
    @RequestMapping("/selectById1")
    public ModelAndView update01(int idd){
        User users = userService.selectById(idd);
        System.out.println(users);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("show");
        modelAndView.addObject("users",users);
        return modelAndView;

    }

    @RequestMapping("/insertUser")
    public String insertUser(){
        //userService.insertUser(user);
        //return "redirect:/user/selectAll";
        return  "insertUser";
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insert(User user){
          userService.insertUser(user);

        return "redirect:/user/selectAll";

    }
    @RequestMapping("/updateById")
    public String updateById(User user){
        System.out.println(user);
        userService.updateById(user);
        return "redirect:/user/selectAll";
    }


@RequestMapping("/deleteById/{id}" )
    public String deleteById(@PathVariable(value = "id") int id){
    userService.deleteById(id);
    //System.out.println(user);
    return "redirect:/user/selectAll";
}


}
