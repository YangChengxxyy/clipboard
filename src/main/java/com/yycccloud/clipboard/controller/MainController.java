package com.yycccloud.clipboard.controller;

import com.yycccloud.clipboard.entity.Clipboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/get_all_clipboard")
    public List<Clipboard> getAllClipBoard() {
        String sql = "select * from clipboard";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        List<Clipboard> clipboardList = new LinkedList<>();
        if (maps.size() == 0) {
            return clipboardList;
        }
        for (Map<String, Object> map : maps) {
            int id = Integer.parseInt(map.get("id").toString());
            String content = map.get("content").toString();
            long date = Long.parseLong(map.get("date").toString());
            Clipboard clipboard = new Clipboard(id, content, date);
            clipboardList.add(clipboard);
        }
        return clipboardList;
    }

    @RequestMapping("add_clipboard")
    public boolean addClipboard(@RequestParam("content") String content) {
        long now = System.currentTimeMillis();
        String sql = "insert into clipboard(content,`date`) values('" + content + "'," + now + ")";
        int i = jdbcTemplate.update(sql);
        return i > 0;
    }

    @RequestMapping("remove_clipboard")
    public boolean removeClipboard(@RequestParam("id") int id) {
        String sql = "delete from clipboard where id = " + id;
        int i = jdbcTemplate.update(sql);
        return i > 0;
    }
}
