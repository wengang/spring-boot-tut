package dev.local.todo;

import dev.local.taskgroup.TaskGroup;
import dev.local.user.User;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.List;

/**
 * Todo是一个领域对象（domain object）
 */
@Data
public class Todo {
    @Id private String id;
    private String desc;
    private boolean completed;
//<<<<<<< HEAD
    @DBRef(lazy = true)
    private TaskGroup group;
    @DBRef(lazy = true)
    private User owner;
    @DBRef(lazy = true)
    private List<User> participants;
    private Date dueDate;
    private Date reminder;
    private int priority;
    private String remark;
//=======
//    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//>>>>>>> chap04
}
