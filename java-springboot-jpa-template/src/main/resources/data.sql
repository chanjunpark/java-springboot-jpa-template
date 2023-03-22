-- create test post
insert into post(post_id, content) values(1, 'test post #1');
insert into post(post_id, content) values(2, 'test post #2');

-- create test comment
insert into comment(post_id, comment_id, content, upload_date) values (1, 1, 'test comment#1 on post#1' , '2023-03-22');
insert into comment(post_id, comment_id, content, upload_date) values (1, 2, 'test comment#2 on post#1' , '2023-03-22');
insert into comment(post_id, comment_id, content, upload_date) values (1, 3, 'test comment#3 on post#1' , '2023-03-22');
insert into comment(post_id, comment_id, content, upload_date) values (1, 4, 'test comment#4 on post#1' , '2023-03-22');
insert into comment(post_id, comment_id, content, upload_date) values (2, 1, 'test comment#1 on post#1' , '2023-03-22');
insert into comment(post_id, comment_id, content, upload_date) values (2, 2, 'test comment#2 on post#1' , '2023-03-22');
insert into comment(post_id, comment_id, content, upload_date) values (2, 3, 'test comment#3 on post#1' , '2023-03-22');
insert into comment(post_id, comment_id, content, upload_date) values (2, 4, 'test comment#4 on post#1' , '2023-03-22');
