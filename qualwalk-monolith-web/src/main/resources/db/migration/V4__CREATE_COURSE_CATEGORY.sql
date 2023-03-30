CREATE TABLE IF NOT EXISTS COURSE_CATEGORY(
--    ID BIGSERIAL PRIMARY KEY,
    CATEGORY VARCHAR(8) PRIMARY KEY,
    DESCRIPTION VARCHAR(35)
);

INSERT INTO COURSE_CATEGORY(CATEGORY, DESCRIPTION) VALUES ('PRGRMMNG', 'Programming');
INSERT INTO COURSE_CATEGORY(CATEGORY, DESCRIPTION) VALUES ('DVLPMENT', 'Development');
INSERT INTO COURSE_CATEGORY(CATEGORY, DESCRIPTION) VALUES ('TESTING', 'Software testing');
INSERT INTO COURSE_CATEGORY(CATEGORY, DESCRIPTION) VALUES ('CLDCOMPT', 'Cloud computing');
INSERT INTO COURSE_CATEGORY(CATEGORY, DESCRIPTION) VALUES ('DATASCNC', 'Data science');
INSERT INTO COURSE_CATEGORY(CATEGORY, DESCRIPTION) VALUES ('CYBRSECT', 'Cyber security');
INSERT INTO COURSE_CATEGORY(CATEGORY, DESCRIPTION) VALUES ('DEVOPS', 'DevOps');
INSERT INTO COURSE_CATEGORY(CATEGORY, DESCRIPTION) VALUES ('AGILE', 'Agile and Scrum');
INSERT INTO COURSE_CATEGORY(CATEGORY, DESCRIPTION) VALUES ('SOFTTOOL', 'Software tools');

