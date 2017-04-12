
HashSet<String> myhash = new HashSet<String>();
for (int i = 0; i < t; i++) {
	myhash.add(pair_left[i]+"#"+pair_right[i]);
	System.out.println(myhash.size());
}