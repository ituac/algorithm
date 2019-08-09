package org.ituac.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.lang.model.type.IntersectionType;

/**
 * 
 * @author ituac
 * 两个数据求交集
 */

public class Solution {
	
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j])) {
                set.add(nums2[j]);
            }
        }

        int[] res = new int[set.size()];
        Iterator iterator = set.iterator();
        int k = 0;
        while (iterator.hasNext()) {
            res[k] = (int) iterator.next();
            k++;
        }

        return res;
	}
	
}
