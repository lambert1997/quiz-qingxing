package com.lvpao.qingxing;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author 张浩
 * 将map数组，根据指定key去重
 */
public class DeduplicateMap {
    public static void main(String[] args) {
        List<Map<String, Integer>> list = new ArrayList<>();
        Arrays.asList(1, 2, 3, 1).forEach(e -> {
            list.add(new HashMap<String, Integer>() {{
                put("id", e);
            }});
        });
        System.out.println("去重前: " + list);
        System.out.println("去重后: " + deduplicateMapByKey(list, "id"));
    }

    /**
     * 根据 @param {key} 将列表@param {mapList}中的元素去重
     *
     * @param mapList
     * @param key
     * @return
     */
    private static List<Map<String, Integer>> deduplicateMapByKey(List<Map<String, Integer>> mapList, String key) {
        return mapList.stream()
                .collect(Collectors.toMap(
                        map -> map.get(key), Function.identity(), (v1, v2) -> v1
                ))
                .values()
                .stream()
                .collect(Collectors.toList());
    }
}

