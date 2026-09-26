#两数之和
##哈希表
- table.containsKey(Key)：查找Key对应的值是否存在，返回值为boolean：存在则为true,否则为false
- table.get(Key)：获取键对应的值value，若为空则返回null
- table.put(Key, Value)：将该键值对添加到表中，返回值为该键原来的旧值，若旧值为空，则返回null；如果旧值本来就是null，返回的也是null，此时无法得知旧值为空还是null
- put取出旧值并添加新值，get只取出新值