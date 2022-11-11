CREATE TABLE `post` (
                        `post_id` int(20) NOT NULL AUTO_INCREMENT,
                        `post_title` varchar(20) COLLATE utf8_bin NOT NULL,
                        `user_id` int(20) NOT NULL,
                        `img_url` varchar(20) COLLATE utf8_bin NOT NULL,
                        `likes` int(20) NOT NULL,
                        PRIMARY KEY (`post_id`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO 'post' VALUES ('1', '临光', '1', 'light.jpg', '24');
INSERT INTO 'post' VALUES ('2', 'ithaca fall', '6', 'fall.jpg', '26');
INSERT INTO 'post' VALUES ('3', 'ghost', '3', 'halloween.jpg', '4');
INSERT INTO 'post' VALUES ('4', '新皮肤', '6', 'paj.jpg', '0');
INSERT INTO 'post' VALUES ('5', '阎魔', '2', 'yanmo.jpg', '3');
INSERT INTO 'post' VALUES ('6', 'ithaca fall', '6', 'fall.jpg', '9');