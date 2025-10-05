Select id,movie,description,rating from cinema
where description != 'boring' and id % 2 = 1
group by id
order by rating desc