import { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import CreateDetail from '../components/common/CreateDetail';
import SmallButton from '../components/button/SmallButton.jsx';
import axios from '../api/axios.jsx';

export default function DailyCreatePage() {
  const [errorMessage, setErrorMessage] = useState('');
  const navigate = useNavigate();

  const [formData, setFormData] = useState({
    // 로그인 후 sprintId 받아오면 수정하기
    sprintId: 1,
    title: '',
    content: '',
  });

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleClick = () => {
    // 로그인 후 유저 정보 같이 보내기
    if (!formData.title) {
      setErrorMessage('제목을 입력해 주세요.');
      return;
    }
    if (!formData.content) {
      setErrorMessage('내용을 입력해 주세요.');
      return;
    }
    axios
      .post('/record/daily', formData)
      .then((response) => {
        navigate('/family/record');
      })
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <>
      <div className="h-5/6">
        <h1>일상 글쓰기</h1>
        <CreateDetail
          title={formData.title}
          content={formData.content}
          onInputChange={handleChange}
        />
      </div>
      <div className="h-1/6">
        <span onClick={handleClick}>
          <SmallButton text="글쓰기" />
        </span>
        <p className="text-red-400">{errorMessage}</p>
      </div>
    </>
  );
}
