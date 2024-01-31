import { useState } from 'react';
import SmallButton from '../components/button/SmallButton.jsx';
import chunsik from '../assets/images/chunsik.jpg';
import axios from '../api/axios.jsx';

export default function FamilyCreatePage() {
  const [previewImage, setPreviewImage] = useState(chunsik);
  const [data, setData] = useState({
    name: '',
    motto: '',
    image: chunsik,
  });
  const handleClick = () => {
    const formData = new FormData();
    formData.append('name', data.name);
    formData.append('motto', data.motto);
    formData.append('image', data.image);

    axios
      .post('/family/insertFamliy', formData, {
        headers: { 'Content-Type': 'multipart/form-data' },
      })
      .then((response) => {
        console.log(response);
      })
      .catch((error) => {
        console.log(error);
      });
  };
  const handleFileChange = (e) => {
    const file = e.target.files[0];

    if (file) {
      const reader = new FileReader();

      reader.onloadend = () => {
        setPreviewImage(reader.result);
        setData({
          ...data,
          image: file,
        });
      };
      reader.readAsDataURL(file);
    }
  };
  const handleNameChange = (e) => {
    setData({
      ...data,
      name: e.target.value,
    });
  };

  const handleMottoChange = (e) => {
    setData({
      ...data,
      motto: e.target.value,
    });
  };

  return (
    <>
      <div className="h-screen text-center align-middle w-full py-24 px-60 ">
        <div className="border-8 border-black bg-white h-full w-full rounded-xl p-5">
          <h1 className="text-2xl mb-5">가족 생성하기</h1>
          <div className="flex align-middle flex-col w-full h-full">
            <p>사진 미리보기</p>
            <div className="flex h-1/3 w-full justify-center mb-5">
              <img
                src={previewImage}
                alt="미리보기"
                className="h-40 w-40 object-contain rounded-md"
              />
            </div>

            <div className="w-full flex justify-around m-2">
              <p className="w-1/4">가족 대표 사진</p>
              <input
                type="file"
                onChange={handleFileChange}
                className="border-4 border-black p-1 rounded-md w-1/2"
              />
            </div>
            <div className="w-full flex justify-around m-2">
              <p className="w-1/4">가족 이름</p>
              <input
                type="text"
                onChange={handleNameChange}
                className="border-4 border-black rounded-md p-1 w-1/2"
              />
            </div>
            <div className="w-full flex justify-around m-2">
              <p className="w-1/4">가훈</p>
              <input
                type="text"
                onChange={handleMottoChange}
                className="border-4 border-black rounded-md p-1 w-1/2"
              />
            </div>
            <span onClick={handleClick}>
              <SmallButton text="생성하기" />
            </span>
          </div>
        </div>
      </div>
    </>
  );
}
