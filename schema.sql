--
-- Estrutura da tabela `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `email` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `page_admin` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

ALTER TABLE `students`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);
  
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT = 1;
  
-- --------------------------------------------------------

--
-- Estrutura da tabela `questions`
--

CREATE TABLE `questions` (
  `id` int(11) NOT NULL,
  `statment` varchar(400) NOT NULL,
  `alternative1` varchar(400) NOT NULL,
  `alternative2` varchar(400) NOT NULL,
  `alternative3` varchar(400) NOT NULL,
  `alternative4` varchar(400) NOT NULL,
  `alternative5` varchar(400) NOT NULL,
  `correct` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

ALTER TABLE `questions`
  ADD PRIMARY KEY (`id`);
  
ALTER TABLE `questions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT = 1;
  
-- --------------------------------------------------------

--
-- Estrutura da tabela `answers_students`
--

CREATE TABLE `answers_students` (
  `id` int(11) NOT NULL,
  `question_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `student_answer` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

ALTER TABLE `answers_students`
  ADD PRIMARY KEY (`id`);
  
ALTER TABLE `answers_students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT = 1;
  
-- --------------------------------------------------------

--
-- Estrutura da tabela `dbconfig`
--

CREATE TABLE `dbconfig` (
  `questions_size` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------